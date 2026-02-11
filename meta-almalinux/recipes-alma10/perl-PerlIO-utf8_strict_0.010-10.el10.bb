
PN = "perl-PerlIO-utf8_strict"
PE = "0"
PV = "0.010"
PR = "10.el10"
PACKAGES = "perl-PerlIO-utf8_strict perl-PerlIO-utf8_strict-tests"


URI_perl-PerlIO-utf8_strict = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/perl-PerlIO-utf8_strict-0.010-10.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:perl-PerlIO-utf8_strict = "
 glibc
 perl-libs
"

URI_perl-PerlIO-utf8_strict-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-PerlIO-utf8_strict-tests-0.010-10.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:perl-PerlIO-utf8_strict-tests = "
 perl-Test-Harness
 perl-libs
 perl-Carp
 perl-Test-Simple
 perl-IO
 perl-PerlIO-utf8_strict
 bash
 perl-PathTools
 perl-interpreter
 perl-Test-Exception
 perl-lib
"
