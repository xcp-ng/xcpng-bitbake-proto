
inherit dnf-bridge

PN = "vulkan-volk"
PE = "0"
PV = "1.4.304.0"
PR = "1.el10"
PACKAGES = "vulkan-volk-devel"


URI_vulkan-volk-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/vulkan-volk-devel-1.4.304.0-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:vulkan-volk-devel = " \
 vulkan-headers \
 cmake-filesystem \
"
