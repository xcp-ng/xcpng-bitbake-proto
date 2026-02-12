
inherit dnf-bridge

PN = "perl-Test-Warn"
PE = "0"
PV = "0.37"
PR = "7.el10"
PACKAGES = "perl-Test-Warn"


URI_src = "https://vault.almalinux.org/10.0/CRB/Source/Packages/perl-Test-Warn-0.37-7.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_perl-Test-Warn = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/perl-Test-Warn-0.37-7.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_perl-Test-Warn}"
RDEPENDS:perl-Test-Warn = " \
 perl-libs \
 perl-Test-Simple \
 perl-Carp \
 perl-Sub-Uplevel \
 perl-Exporter \
"
