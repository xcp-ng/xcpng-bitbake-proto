
inherit dnf-bridge

PN = "perl-Unicode-EastAsianWidth"
PE = "0"
PV = "12.0"
PR = "16.el10"
PACKAGES = "perl-Unicode-EastAsianWidth"


URI_src = "https://vault.almalinux.org/10.0/CRB/Source/Packages/perl-Unicode-EastAsianWidth-12.0-16.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_perl-Unicode-EastAsianWidth = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/perl-Unicode-EastAsianWidth-12.0-16.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_perl-Unicode-EastAsianWidth}"
RDEPENDS:perl-Unicode-EastAsianWidth = " \
 perl-Exporter \
 perl-libs \
 perl-base \
 perl-vars \
"
