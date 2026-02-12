
inherit dnf-bridge

PN = "perl-ExtUtils-Config"
PE = "0"
PV = "0.008"
PR = "32.el10"
PACKAGES = "perl-ExtUtils-Config"


URI_src = "https://vault.almalinux.org/10.0/devel/Source/Packages/perl-ExtUtils-Config-0.008-32.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_perl-ExtUtils-Config = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-ExtUtils-Config-0.008-32.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_perl-ExtUtils-Config}"
RDEPENDS:perl-ExtUtils-Config = " \
 perl-libs \
 perl-Data-Dumper \
"
