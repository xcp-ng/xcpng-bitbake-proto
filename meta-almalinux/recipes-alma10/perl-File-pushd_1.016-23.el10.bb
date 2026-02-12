
inherit dnf-bridge

PN = "perl-File-pushd"
PE = "0"
PV = "1.016"
PR = "23.el10"
PACKAGES = "perl-File-pushd perl-File-pushd-tests"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/perl-File-pushd-1.016-23.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_perl-File-pushd = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-File-pushd-1.016-23.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_perl-File-pushd}"
RDEPENDS:perl-File-pushd = " \
 perl-libs \
 perl-Carp \
 perl-overload \
 perl-PathTools \
 perl-Exporter \
 perl-File-Path \
 perl-File-Temp \
"

URI_perl-File-pushd-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-File-pushd-tests-1.016-23.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_perl-File-pushd-tests}"
RDEPENDS:perl-File-pushd-tests = " \
 perl-File-pushd \
 perl-Test-Harness \
 perl-libs \
 perl-ExtUtils-MakeMaker \
 perl-Test-Simple \
 perl-File-Basename \
 perl-PathTools \
 bash \
 perl-interpreter \
 perl-File-Path \
 perl-File-Temp \
"
