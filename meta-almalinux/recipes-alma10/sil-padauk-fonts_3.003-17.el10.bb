
inherit dnf-bridge

PN = "sil-padauk-fonts"
PE = "0"
PV = "3.003"
PR = "17.el10"
PACKAGES = "sil-padauk-fonts sil-padauk-book-fonts"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/sil-padauk-fonts-3.003-17.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_sil-padauk-fonts = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/sil-padauk-fonts-3.003-17.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_sil-padauk-fonts}"
RDEPENDS:sil-padauk-fonts = " \
 fonts-filesystem \
"

URI_sil-padauk-book-fonts = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/sil-padauk-book-fonts-3.003-17.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_sil-padauk-book-fonts}"
RDEPENDS:sil-padauk-book-fonts = " \
 fonts-filesystem \
"
