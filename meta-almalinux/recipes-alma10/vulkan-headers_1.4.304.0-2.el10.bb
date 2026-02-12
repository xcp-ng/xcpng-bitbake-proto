
inherit dnf-bridge

PN = "vulkan-headers"
PE = "0"
PV = "1.4.304.0"
PR = "2.el10"
PACKAGES = "vulkan-headers"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/vulkan-headers-1.4.304.0-2.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_vulkan-headers = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/vulkan-headers-1.4.304.0-2.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_vulkan-headers}"
RDEPENDS:vulkan-headers = " \
 python3 \
 cmake-filesystem \
"
