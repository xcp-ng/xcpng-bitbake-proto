
inherit dnf-bridge

PN = "perl-Test-Warnings"
PE = "0"
PV = "0.033"
PR = "3.el10"
PACKAGES = "perl-Test-Warnings"


URI_src = "https://vault.almalinux.org/10.0/CRB/Source/Packages/perl-Test-Warnings-0.033-3.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_perl-Test-Warnings = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/perl-Test-Warnings-0.033-3.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_perl-Test-Warnings}"
RDEPENDS:perl-Test-Warnings = " \
 perl-libs \
 perl-Test-Simple \
 perl-Carp \
 perl-parent \
 perl-Exporter \
"
