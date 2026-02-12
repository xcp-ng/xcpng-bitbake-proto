
inherit dnf-bridge

PN = "fwupd-efi"
PE = "0"
PV = "1.6"
PR = "3.el10.alma.1"
PACKAGES = "fwupd-efi"


URI_src = "https://vault.almalinux.org/10.0/BaseOS/Source/Packages/fwupd-efi-1.6-3.el10.alma.1.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_fwupd-efi = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/fwupd-efi-1.6-3.el10.alma.1.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_fwupd-efi}"
RDEPENDS:fwupd-efi = " \
 pkgconf-pkg-config \
"
