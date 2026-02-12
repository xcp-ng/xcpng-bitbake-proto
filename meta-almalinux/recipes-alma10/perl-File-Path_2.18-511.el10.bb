
inherit dnf-bridge

PN = "perl-File-Path"
PE = "0"
PV = "2.18"
PR = "511.el10"
PACKAGES = "perl-File-Path perl-File-Path-tests"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/perl-File-Path-2.18-511.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_perl-File-Path = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-File-Path-2.18-511.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_perl-File-Path}"
RDEPENDS:perl-File-Path = " \
 perl-libs \
 perl-Carp \
 perl-vars \
 perl-File-Basename \
 perl-PathTools \
 perl-Exporter \
"

URI_perl-File-Path-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-File-Path-tests-2.18-511.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_perl-File-Path-tests}"
RDEPENDS:perl-File-Path-tests = " \
 perl-Test-Harness \
 perl-libs \
 perl-Test-Simple \
 perl-Carp \
 perl-SelectSaver \
 perl-Fcntl \
 perl-Symbol \
 bash \
 perl-base \
 perl-PathTools \
 perl-Errno \
 perl-interpreter \
 perl-File-Path \
 perl-Exporter \
 perl-lib \
"
