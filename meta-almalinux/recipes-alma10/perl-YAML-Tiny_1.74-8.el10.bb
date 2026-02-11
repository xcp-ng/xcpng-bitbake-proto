
PN = "perl-YAML-Tiny"
PE = "0"
PV = "1.74"
PR = "8.el10"
PACKAGES = "perl-YAML-Tiny perl-YAML-Tiny-tests"


URI_perl-YAML-Tiny = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/perl-YAML-Tiny-1.74-8.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-YAML-Tiny = "
 perl-Scalar-List-Utils
 perl-libs
 perl-Carp
 perl-Fcntl
 perl-B
 perl-Exporter
"

URI_perl-YAML-Tiny-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-YAML-Tiny-tests-1.74-8.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-YAML-Tiny-tests = "
 perl-Scalar-List-Utils
 perl-libs
 perl-Getopt-Long
 perl-open
 perl-Test-Harness
 perl-Carp
 perl-Test-Simple
 perl-vars
 perl-IO
 perl-YAML-Tiny
 perl-File-Temp
 bash
 perl-Exporter
 perl-base
 perl-ExtUtils-MakeMaker
 perl-File-Basename
 perl-PathTools
 perl-File-Find
 perl-interpreter
 perl-lib
"
