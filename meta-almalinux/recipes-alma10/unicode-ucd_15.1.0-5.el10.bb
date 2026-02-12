
inherit dnf-bridge

PN = "unicode-ucd"
PE = "0"
PV = "15.1.0"
PR = "5.el10"
PACKAGES = "unicode-ucd unicode-ucd-unihan"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/unicode-ucd-15.1.0-5.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_unicode-ucd = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/unicode-ucd-15.1.0-5.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_unicode-ucd}"
RDEPENDS:unicode-ucd = ""

URI_unicode-ucd-unihan = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/unicode-ucd-unihan-15.1.0-5.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_unicode-ucd-unihan}"
RDEPENDS:unicode-ucd-unihan = " \
 unicode-ucd \
"
