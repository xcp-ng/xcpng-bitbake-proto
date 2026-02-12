
inherit dnf-bridge

PN = "zaf"
PE = "0"
PV = "0"
PR = "0.31.20080714svn.el10"
PACKAGES = "hyphen-af hyphen-zu"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/zaf-0-0.31.20080714svn.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_hyphen-af = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/hyphen-af-0-0.31.20080714svn.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_hyphen-af}"
RDEPENDS:hyphen-af = " \
 hyphen \
"

URI_hyphen-zu = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/hyphen-zu-0-0.31.20080714svn.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_hyphen-zu}"
RDEPENDS:hyphen-zu = " \
 hyphen \
"
