
inherit dnf-bridge

PN = "perl-Devel-PPPort"
PE = "0"
PV = "3.72"
PR = "512.el10"
PACKAGES = "perl-Devel-PPPort perl-Devel-PPPort-tests"


URI_perl-Devel-PPPort = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-Devel-PPPort-3.72-512.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:perl-Devel-PPPort = " \
 glibc \
 perl-libs \
 perl-vars \
"

URI_perl-Devel-PPPort-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-Devel-PPPort-tests-3.72-512.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:perl-Devel-PPPort-tests = " \
 perl-Devel-PPPort \
 perl-Test-Harness \
 perl-libs \
 perl-vars \
 perl-FindBin \
 perl-DynaLoader \
 perl-overload \
 perl-PathTools \
 bash \
 perl-interpreter \
 perl-File-Path \
 perl-less \
 perl-lib \
"
