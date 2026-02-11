
PN = "perl-Devel-CheckLib"
PE = "0"
PV = "1.16"
PR = "14.el10"
PACKAGES = "perl-Devel-CheckLib perl-Devel-CheckLib-tests"


URI_perl-Devel-CheckLib = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/perl-Devel-CheckLib-1.16-14.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Devel-CheckLib = "
 perl-libs
 perl-vars
 perl-interpreter
 redhat-rpm-config
 perl-Text-ParseWords
 perl-Devel-CheckLib
 perl-PathTools
 perl-Exporter
 perl-File-Temp
"

URI_perl-Devel-CheckLib-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-Devel-CheckLib-tests-1.16-14.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Devel-CheckLib-tests = "
 perl-Test-Harness
 perl-libs
 perl-Test-Simple
 perl-vars
 perl-IO
 perl-Capture-Tiny
 perl-File-Temp
 perl-Devel-CheckLib
 bash
 perl-PathTools
 gcc
 perl-interpreter
 perl-Exporter
 perl-lib
"
