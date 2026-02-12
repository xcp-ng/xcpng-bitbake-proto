
inherit dnf-bridge

PN = "hyphen"
PE = "0"
PV = "2.8.8"
PR = "26.el10"
PACKAGES = "hyphen hyphen-devel hyphen-en"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/hyphen-2.8.8-26.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_hyphen = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/hyphen-2.8.8-26.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_hyphen}"
RDEPENDS:hyphen = " \
 glibc \
"

URI_hyphen-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/hyphen-devel-2.8.8-26.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_hyphen-devel}"
RDEPENDS:hyphen-devel = " \
 hyphen \
 perl-interpreter \
"

URI_hyphen-en = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/hyphen-en-2.8.8-26.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_hyphen-en}"
RDEPENDS:hyphen-en = " \
 hyphen \
"
