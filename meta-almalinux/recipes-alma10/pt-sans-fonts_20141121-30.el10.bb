
inherit dnf-bridge

PN = "pt-sans-fonts"
PE = "0"
PV = "20141121"
PR = "30.el10"
PACKAGES = "pt-sans-fonts pt-sans-fonts-doc"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/pt-sans-fonts-20141121-30.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_pt-sans-fonts = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/pt-sans-fonts-20141121-30.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_pt-sans-fonts}"
RDEPENDS:pt-sans-fonts = " \
 fonts-filesystem \
"

URI_pt-sans-fonts-doc = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/pt-sans-fonts-doc-20141121-30.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_pt-sans-fonts-doc}"
RDEPENDS:pt-sans-fonts-doc = ""
