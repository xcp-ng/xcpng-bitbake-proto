
inherit dnf-bridge

PN = "vulkan-validation-layers"
PE = "0"
PV = "1.4.304.0"
PR = "1.el10"
PACKAGES = "vulkan-validation-layers"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/vulkan-validation-layers-1.4.304.0-1.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_vulkan-validation-layers = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/vulkan-validation-layers-1.4.304.0-1.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_vulkan-validation-layers}"
RDEPENDS:vulkan-validation-layers = " \
 glibc \
 spirv-tools-libs \
 libgcc \
 libstdc++ \
"
