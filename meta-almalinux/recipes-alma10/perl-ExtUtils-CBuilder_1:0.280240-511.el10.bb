
PN = "perl-ExtUtils-CBuilder"
PE = "1"
PV = "0.280240"
PR = "511.el10"
PACKAGES = "perl-ExtUtils-CBuilder perl-ExtUtils-CBuilder-tests"


URI_perl-ExtUtils-CBuilder = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-ExtUtils-CBuilder-0.280240-511.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-ExtUtils-CBuilder = " \
 perl-libs \
 perl-ExtUtils-MakeMaker \
 perl-IO \
 perl-devel \
 perl-Text-ParseWords \
 perl-File-Basename \
 perl-DynaLoader \
 perl-IPC-Cmd \
 perl-PathTools \
 perl-Perl-OSType \
 gcc \
 gcc-c++ \
 perl-File-Path \
 perl-ExtUtils-CBuilder \
 perl-File-Temp \
"

URI_perl-ExtUtils-CBuilder-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-ExtUtils-CBuilder-tests-0.280240-511.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-ExtUtils-CBuilder-tests = " \
 perl-Test-Harness \
 perl-libs \
 perl-Test-Simple \
 bash \
 perl-PathTools \
 perl-interpreter \
 perl-File-Path \
 perl-ExtUtils-CBuilder \
 perl-File-Temp \
"
