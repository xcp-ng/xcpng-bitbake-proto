
inherit dnf-bridge

PN = "perl-ExtUtils-PkgConfig"
PE = "0"
PV = "1.16"
PR = "26.el10"
PACKAGES = "perl-ExtUtils-PkgConfig"


URI_src = "https://vault.almalinux.org/10.0/devel/Source/Packages/perl-ExtUtils-PkgConfig-1.16-26.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_perl-ExtUtils-PkgConfig = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-ExtUtils-PkgConfig-1.16-26.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_perl-ExtUtils-PkgConfig}"
RDEPENDS:perl-ExtUtils-PkgConfig = " \
 perl-libs \
 perl-Carp \
 perl-vars \
 pkgconf-pkg-config \
 perl-English \
"
