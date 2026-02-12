
inherit dnf-bridge

PN = "jomolhari-fonts"
PE = "0"
PV = "0.003"
PR = "43.el10"
PACKAGES = "jomolhari-fonts"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/jomolhari-fonts-0.003-43.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_jomolhari-fonts = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/jomolhari-fonts-0.003-43.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_jomolhari-fonts}"
RDEPENDS:jomolhari-fonts = " \
 fonts-filesystem \
"
