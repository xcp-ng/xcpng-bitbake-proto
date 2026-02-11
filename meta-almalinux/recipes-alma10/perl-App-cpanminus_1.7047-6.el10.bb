
PN = "perl-App-cpanminus"
PE = "0"
PV = "1.7047"
PR = "6.el10"
PACKAGES = "perl-App-cpanminus perl-App-cpanminus-tests"


URI_perl-App-cpanminus = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-App-cpanminus-1.7047-6.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-App-cpanminus = " \
 perl-File-pushd \
 perl-Safe \
 perl-libs \
 perl-local-lib \
 perl \
 perl-App-cpanminus \
 perl-Getopt-Long \
 perl-String-ShellQuote \
 perl-Symbol \
 perl-HTTP-Tiny \
 perl-CPAN-DistnameInfo \
 perl-CPAN-Meta \
 perl-CPAN-Meta-Check \
 perl-CPAN-Meta-Requirements \
 perl-CPAN-Meta-YAML \
 perl-version \
 perl-Module-Build \
 perl-Digest-SHA \
 perl-Module-CoreList \
 perl-Module-CPANfile \
 perl-Module-Metadata \
 perl-YAML \
 perl-constant \
 perl-ExtUtils-Install \
 perl-ExtUtils-MakeMaker \
 perl-ExtUtils-Manifest \
 perl-File-Basename \
 perl-File-Copy \
 perl-PathTools \
 perl-Parse-PMFile \
 perl-File-Find \
 perl-interpreter \
 perl-File-Path \
 perl-File-Temp \
"

URI_perl-App-cpanminus-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-App-cpanminus-tests-1.7047-6.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-App-cpanminus-tests = " \
 perl-Test-Harness \
 perl-libs \
 perl-Test-Simple \
 perl-App-cpanminus \
 bash \
 perl-interpreter \
"
