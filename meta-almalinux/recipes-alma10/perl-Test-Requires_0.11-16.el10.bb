
inherit dnf-bridge

PN = "perl-Test-Requires"
PE = "0"
PV = "0.11"
PR = "16.el10"
PACKAGES = "perl-Test-Requires"


URI_src = "https://vault.almalinux.org/10.0/CRB/Source/Packages/perl-Test-Requires-0.11-16.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_perl-Test-Requires = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/perl-Test-Requires-0.11-16.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_perl-Test-Requires}"
RDEPENDS:perl-Test-Requires = " \
 perl-libs \
 perl-base \
 perl-Test-Simple \
"
