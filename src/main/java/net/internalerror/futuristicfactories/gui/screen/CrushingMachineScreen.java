package net.internalerror.futuristicfactories.gui.screen;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.vertex.PoseStack;
import net.internalerror.futuristicfactories.gui.menu.CrushingMachineMenu;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.renderer.GameRenderer;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.player.Inventory;

import static net.internalerror.futuristicfactories.FuturisticFactories.MOD_ID;


public class CrushingMachineScreen extends AbstractContainerScreen<CrushingMachineMenu> {

    private static final ResourceLocation texture = new ResourceLocation(MOD_ID, "textures/gui/crushing_machine_gui.png");


    public CrushingMachineScreen(CrushingMachineMenu crushingMachineMenu, Inventory inventory, Component component) {
        super(crushingMachineMenu, inventory, component);
        imageWidth = 176;
        imageHeight = 190;
    }


    @Override
    protected void init() {
        super.init();
    }

    @Override
    protected void renderBg(PoseStack poseStack, float partialTick, int mouseX, int mouseY) {
        RenderSystem.setShader(GameRenderer::getPositionTexShader);
        RenderSystem.setShaderColor(1.0f, 1.0f, 1.0f, 1.0f);
        RenderSystem.setShaderTexture(0, texture);
        int x = (width - imageWidth) / 2;
        int y = (height - imageHeight) / 2;

        blit(poseStack, x, y, 0, 0, imageWidth, imageHeight);
        renderProgressArrow(poseStack, x, y);
    }

    private void renderProgressArrow(PoseStack poseStack, int x, int y) {
        if (menu.isCrafting()) {
            blit(poseStack, x + 77, y + 36, 176, 0, menu.getScaledProgress(),16 );
        }

    }


    @Override
    public void render(PoseStack poseStack, int mouseX, int mouseY, float delta) {
        renderBackground(poseStack);
        super.render(poseStack, mouseX, mouseY, delta);
        renderTooltip(poseStack, mouseX, mouseY);
    }
}
