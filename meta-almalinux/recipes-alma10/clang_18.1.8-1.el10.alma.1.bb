
inherit dnf-bridge

PN = "clang"
PE = "0"
PV = "18.1.8"
PR = "1.el10.alma.1"
PACKAGES = "clang-resource-filesystem"


URI_src = "https://vault.almalinux.org/10.0/devel/Source/Packages/clang-18.1.8-1.el10.alma.1.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_clang-resource-filesystem = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/clang-resource-filesystem-18.1.8-1.el10.alma.1.noarch.rpm;unpack=0"
SRC_URI += "${URI_clang-resource-filesystem}"
RDEPENDS:clang-resource-filesystem = ""
