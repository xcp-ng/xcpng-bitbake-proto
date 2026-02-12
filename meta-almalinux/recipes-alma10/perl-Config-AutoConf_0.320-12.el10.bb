
inherit dnf-bridge

PN = "perl-Config-AutoConf"
PE = "0"
PV = "0.320"
PR = "12.el10"
PACKAGES = "perl-Config-AutoConf"


URI_src = "https://vault.almalinux.org/10.0/CRB/Source/Packages/perl-Config-AutoConf-0.320-12.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_perl-Config-AutoConf = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/perl-Config-AutoConf-0.320-12.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_perl-Config-AutoConf}"
RDEPENDS:perl-Config-AutoConf = " \
 perl-constant \
 perl-libs \
 perl-Carp \
 perl-Text-ParseWords \
 perl-Capture-Tiny \
 perl-File-Basename \
 perl-PathTools \
 perl-Exporter \
 perl-base \
 perl-File-Temp \
"
