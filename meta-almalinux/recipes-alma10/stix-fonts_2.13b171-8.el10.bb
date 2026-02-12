
inherit dnf-bridge

PN = "stix-fonts"
PE = "0"
PV = "2.13b171"
PR = "8.el10"
PACKAGES = "stix-fonts stix-fonts-doc"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/stix-fonts-2.13b171-8.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_stix-fonts = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/stix-fonts-2.13b171-8.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_stix-fonts}"
RDEPENDS:stix-fonts = " \
 fonts-filesystem \
"

URI_stix-fonts-doc = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/stix-fonts-doc-2.13b171-8.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_stix-fonts-doc}"
RDEPENDS:stix-fonts-doc = ""
