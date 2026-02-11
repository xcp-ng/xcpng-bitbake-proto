
inherit dnf-bridge

PN = "perl-ExtUtils-InstallPaths"
PE = "0"
PV = "0.012"
PR = "21.el10"
PACKAGES = "perl-ExtUtils-InstallPaths"


URI_perl-ExtUtils-InstallPaths = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-ExtUtils-InstallPaths-0.012-21.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-ExtUtils-InstallPaths = " \
 perl-PathTools \
 perl-libs \
 perl-ExtUtils-Config \
 perl-Carp \
"
