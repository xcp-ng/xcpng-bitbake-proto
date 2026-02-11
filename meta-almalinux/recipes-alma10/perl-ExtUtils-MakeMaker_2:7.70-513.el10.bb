
PN = "perl-ExtUtils-MakeMaker"
PE = "2"
PV = "7.70"
PR = "513.el10"
PACKAGES = "perl-ExtUtils-Command perl-ExtUtils-MM-Utils perl-ExtUtils-MakeMaker perl-ExtUtils-MakeMaker-tests"


URI_perl-ExtUtils-Command = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-ExtUtils-Command-7.70-513.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-ExtUtils-Command = " \
 perl-libs \
 perl-Carp \
 perl-File-Copy \
 perl-File-Find \
 perl-Exporter \
 perl-File-Path \
"

URI_perl-ExtUtils-MM-Utils = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-ExtUtils-MM-Utils-7.70-513.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-ExtUtils-MM-Utils = " \
 perl-libs \
 perl-vars \
"

URI_perl-ExtUtils-MakeMaker = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-ExtUtils-MakeMaker-7.70-513.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-ExtUtils-MakeMaker = " \
 perl-libs \
 perl-Getopt-Long \
 perl-podlators \
 perl-Test-Harness \
 perl-Carp \
 perl-vars \
 perl-IO \
 perl-version \
 perl-Text-ParseWords \
 perl-Data-Dumper \
 perl-DynaLoader \
 perl-Encode \
 perl-Exporter \
 perl-ExtUtils-Command \
 perl-ExtUtils-Install \
 perl-ExtUtils-MakeMaker \
 perl-ExtUtils-Manifest \
 perl-ExtUtils-ParseXS \
 perl-POSIX \
 perl-File-Basename \
 perl-PathTools \
 perl-File-Find \
 perl-interpreter \
 perl-File-Path \
 perl-lib \
"

URI_perl-ExtUtils-MakeMaker-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-ExtUtils-MakeMaker-tests-7.70-513.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-ExtUtils-MakeMaker-tests = " \
 perl-libs \
 perl-podlators \
 perl-subs \
 perl-CPAN-Meta \
 perl-Test-Harness \
 perl-Test-Simple \
 perl-Carp \
 perl-vars \
 perl-version \
 perl-lib \
 perl-Data-Dumper \
 perl-DynaLoader \
 perl-Encode \
 bash \
 perl-Exporter \
 perl-ExtUtils-CBuilder \
 perl-base \
 perl-ExtUtils-Command \
 perl-ExtUtils-MakeMaker \
 perl-ExtUtils-Manifest \
 perl-devel \
 perl-File-Basename \
 perl-PathTools \
 perl-File-Find \
 perl-interpreter \
 perl-File-Path \
 perl-less \
 perl-File-Temp \
"
