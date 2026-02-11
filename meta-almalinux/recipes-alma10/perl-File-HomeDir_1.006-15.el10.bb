
PN = "perl-File-HomeDir"
PE = "0"
PV = "1.006"
PR = "15.el10"
PACKAGES = "perl-File-HomeDir perl-File-HomeDir-tests"


URI_perl-File-HomeDir = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-File-HomeDir-1.006-15.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-File-HomeDir = "
 perl-libs
 perl-Carp
 perl-vars
 perl-PathTools
 perl-File-HomeDir
 perl-Exporter
 perl-File-Path
 perl-base
 perl-File-Temp
 perl-File-Which
"

URI_perl-File-HomeDir-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-File-HomeDir-tests-1.006-15.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-File-HomeDir-tests = "
 perl-Test-Harness
 perl-libs
 perl-Test-Simple
 bash
 perl-PathTools
 perl-File-HomeDir
 perl-interpreter
"
