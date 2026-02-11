
PN = "perl-IO-Multiplex"
PE = "0"
PV = "1.16"
PR = "30.el10"
PACKAGES = "perl-IO-Multiplex perl-IO-Multiplex-tests"


URI_perl-IO-Multiplex = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-IO-Multiplex-1.16-30.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-IO-Multiplex = "
 perl-constant
 perl-libs
 perl-Carp
 perl-vars
 perl-IO
 perl-FileHandle
 perl-Socket
 perl-Fcntl
 perl-POSIX
 perl-Tie
 perl-Time-HiRes
"

URI_perl-IO-Multiplex-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-IO-Multiplex-tests-1.16-30.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-IO-Multiplex-tests = "
 perl-Test
 perl-Test-Harness
 perl-libs
 perl-IO
 perl-IO-Multiplex
 perl-Fcntl
 perl-POSIX
 bash
 perl-interpreter
"
