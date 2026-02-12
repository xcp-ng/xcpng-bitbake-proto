
inherit dnf-bridge

PN = "spirv-headers"
PE = "0"
PV = "1.5.5"
PR = "24.el10"
PACKAGES = "spirv-headers-devel"


URI_src = "https://vault.almalinux.org/10.0/devel/Source/Packages/spirv-headers-1.5.5-24.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_spirv-headers-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/spirv-headers-devel-1.5.5-24.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_spirv-headers-devel}"
RDEPENDS:spirv-headers-devel = " \
 cmake-filesystem \
 pkgconf-pkg-config \
"
