
inherit dnf-bridge

PN = "gnu-efi"
PE = "1"
PV = "3.0.18"
PR = "4.el10"
PACKAGES = "gnu-efi gnu-efi-devel gnu-efi-utils"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/gnu-efi-3.0.18-4.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_gnu-efi = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/gnu-efi-3.0.18-4.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_gnu-efi}"
RDEPENDS:gnu-efi = ""

URI_gnu-efi-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/gnu-efi-devel-3.0.18-4.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_gnu-efi-devel}"
RDEPENDS:gnu-efi-devel = " \
 gnu-efi \
 pkgconf-pkg-config \
"

URI_gnu-efi-utils = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/gnu-efi-utils-3.0.18-4.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_gnu-efi-utils}"
RDEPENDS:gnu-efi-utils = ""
