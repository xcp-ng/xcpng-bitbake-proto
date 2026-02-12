
inherit dnf-bridge

PN = "perl-srpm-macros"
PE = "0"
PV = "1"
PR = "57.el10"
PACKAGES = "perl-srpm-macros"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/perl-srpm-macros-1-57.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_perl-srpm-macros = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-srpm-macros-1-57.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_perl-srpm-macros}"
RDEPENDS:perl-srpm-macros = ""
