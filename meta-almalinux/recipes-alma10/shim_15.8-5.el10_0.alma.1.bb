
inherit dnf-bridge

PN = "shim"
PE = "0"
PV = "15.8"
PR = "5.el10_0.alma.1"
PACKAGES = "shim-x64"


URI_src = "https://vault.almalinux.org/10.0/BaseOS/Source/Packages/shim-15.8-5.el10_0.alma.1.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_shim-x64 = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/shim-x64-15.8-5.el10_0.alma.1.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_shim-x64}"
RDEPENDS:shim-x64 = " \
 fwupd \
 mokutil \
 efi-filesystem \
"
