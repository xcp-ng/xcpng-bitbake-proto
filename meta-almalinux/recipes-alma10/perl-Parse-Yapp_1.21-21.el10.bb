
PN = "perl-Parse-Yapp"
PE = "0"
PV = "1.21"
PR = "21.el10"
PACKAGES = "perl-Parse-Yapp perl-Parse-Yapp-tests"


URI_perl-Parse-Yapp = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/perl-Parse-Yapp-1.21-21.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Parse-Yapp = "
 perl-libs
 perl-Carp
 perl-vars
 perl-Parse-Yapp
 perl-File-Basename
 perl-Getopt-Std
 perl-interpreter
"

URI_perl-Parse-Yapp-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-Parse-Yapp-tests-1.21-21.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Parse-Yapp-tests = "
 perl-interpreter
 perl-Test-Harness
 bash
 perl-Parse-Yapp
"
