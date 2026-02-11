
PN = "perl-Compress-Raw-Zlib"
PE = "0"
PV = "2.212"
PR = "512.el10"
PACKAGES = "perl-Compress-Raw-Zlib perl-Compress-Raw-Zlib-tests"


URI_perl-Compress-Raw-Zlib = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-Compress-Raw-Zlib-2.212-512.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:perl-Compress-Raw-Zlib = "
 perl-constant
 zlib-ng-compat
 perl-libs
 perl-Carp
 glibc
 perl-Exporter
"

URI_perl-Compress-Raw-Zlib-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-Compress-Raw-Zlib-tests-2.212-512.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:perl-Compress-Raw-Zlib-tests = "
 perl-constant
 perl-Test-Harness
 perl-libs
 perl-Test-Simple
 perl-Carp
 perl-Scalar-List-Utils
 perl-Compress-Raw-Zlib
 bash
 perl-interpreter
 perl-File-Path
 perl-lib
"
