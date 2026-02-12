
inherit dnf-bridge

PN = "google-roboto-slab-fonts"
PE = "0"
PV = "1.100263"
PR = "0.25.20150923git.el10"
PACKAGES = "google-roboto-slab-fonts"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/google-roboto-slab-fonts-1.100263-0.25.20150923git.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_google-roboto-slab-fonts = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/google-roboto-slab-fonts-1.100263-0.25.20150923git.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_google-roboto-slab-fonts}"
RDEPENDS:google-roboto-slab-fonts = " \
 fonts-filesystem \
"
