
PN = "perl-File-Slurper"
PE = "0"
PV = "0.014"
PR = "6.el10"
PACKAGES = "perl-File-Slurper perl-File-Slurper-tests"


URI_perl-File-Slurper = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-File-Slurper-0.014-6.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-File-Slurper = "
 perl-constant
 perl-libs
 perl-Carp
 perl-Encode
 perl-Exporter
"

URI_perl-File-Slurper-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-File-Slurper-tests-0.014-6.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-File-Slurper-tests = "
 perl-Test-Harness
 perl-libs
 perl-Test-Simple
 perl-Test-Warnings
 perl-FindBin
 bash
 perl-PathTools
 perl-interpreter
 perl-File-Slurper
 perl-File-Temp
"
