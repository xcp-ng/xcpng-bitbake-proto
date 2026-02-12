
inherit dnf-bridge

PN = "perl-Mozilla-PublicSuffix"
PE = "0"
PV = "1.0.6"
PR = "8.el10"
PACKAGES = "perl-Mozilla-PublicSuffix"


URI_src = "https://vault.almalinux.org/10.0/devel/Source/Packages/perl-Mozilla-PublicSuffix-1.0.6-8.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_perl-Mozilla-PublicSuffix = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-Mozilla-PublicSuffix-1.0.6-8.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_perl-Mozilla-PublicSuffix}"
RDEPENDS:perl-Mozilla-PublicSuffix = " \
 perl-libs \
 perl-URI \
 publicsuffix-list \
 perl-open \
 perl-Exporter \
"
