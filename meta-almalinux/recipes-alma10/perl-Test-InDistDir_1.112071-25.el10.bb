
inherit dnf-bridge

PN = "perl-Test-InDistDir"
PE = "0"
PV = "1.112071"
PR = "25.el10"
PACKAGES = "perl-Test-InDistDir"


URI_src = "https://vault.almalinux.org/10.0/devel/Source/Packages/perl-Test-InDistDir-1.112071-25.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_perl-Test-InDistDir = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-Test-InDistDir-1.112071-25.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_perl-Test-InDistDir}"
RDEPENDS:perl-Test-InDistDir = " \
 perl-PathTools \
 perl-libs \
 perl-lib \
"
