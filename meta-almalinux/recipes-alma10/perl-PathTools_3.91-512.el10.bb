
PN = "perl-PathTools"
PE = "0"
PV = "3.91"
PR = "512.el10"
PACKAGES = "perl-PathTools perl-PathTools-tests"


URI_perl-PathTools = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-PathTools-3.91-512.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:perl-PathTools = "
 perl-constant
 perl-Scalar-List-Utils
 perl-libs
 perl-Carp
 perl-Errno
 perl-PathTools
 glibc
 perl-Exporter
"

URI_perl-PathTools-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-PathTools-tests-3.91-512.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:perl-PathTools-tests = "
 perl-Test-Harness
 perl-libs
 perl-Test-Simple
 perl-Carp
 perl-Scalar-List-Utils
 perl-File-Temp
 bash
 perl-PathTools
 perl-Errno
 perl-interpreter
 perl-File-Path
 perl-lib
"
