
inherit dnf-bridge

PN = "perl-Test-Harness"
PE = "1"
PV = "3.48"
PR = "512.el10"
PACKAGES = "perl-Test-Harness perl-Test-Harness-tests"


URI_perl-Test-Harness = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-Test-Harness-3.48-512.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Test-Harness = " \
 perl-Benchmark \
 perl-constant \
 perl-Test-Harness \
 perl-libs \
 perl-Carp \
 perl-interpreter \
 perl-IO \
 perl-Text-ParseWords \
 perl-Getopt-Long \
 perl-POSIX \
 perl-File-Basename \
 perl-Errno \
 perl-PathTools \
 perl-File-Find \
 perl-Exporter \
 perl-File-Path \
 perl-base \
"

URI_perl-Test-Harness-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-Test-Harness-tests-3.48-512.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Test-Harness-tests = " \
 perl-constant \
 perl-Test-Harness \
 perl-libs \
 perl-Test-Simple \
 perl-IO \
 perl-Text-ParseWords \
 perl-Getopt-Long \
 perl-POSIX \
 perl-Symbol \
 bash \
 perl-PathTools \
 perl-interpreter \
 perl-File-Path \
 perl-Data-Dumper \
 perl-base \
 perl-lib \
"
