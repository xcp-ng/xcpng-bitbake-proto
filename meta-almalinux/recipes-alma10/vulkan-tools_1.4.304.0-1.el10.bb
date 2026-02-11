
inherit dnf-bridge

PN = "vulkan-tools"
PE = "0"
PV = "1.4.304.0"
PR = "1.el10"
PACKAGES = "vulkan-tools"


URI_vulkan-tools = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/vulkan-tools-1.4.304.0-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:vulkan-tools = " \
 libwayland-client \
 libgcc \
 libX11 \
 libxcb \
 libstdc++ \
 glibc \
"
