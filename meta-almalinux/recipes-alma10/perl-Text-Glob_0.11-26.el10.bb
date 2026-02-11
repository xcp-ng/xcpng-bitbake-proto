
PN = "perl-Text-Glob"
PE = "0"
PV = "0.11"
PR = "26.el10"
PACKAGES = "perl-Text-Glob perl-Text-Glob-tests"


URI_perl-Text-Glob = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-Text-Glob-0.11-26.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Text-Glob = "perl(strict) ( ) perl-libs ( ) perl(Exporter) ( ) perl(vars) ( ) perl(constant) ( )"
RPROVIDES:perl-Text-Glob = "perl(Text::Glob) ( =  0.11) perl-Text-Glob ( =  0.11-26.el10)"

URI_perl-Text-Glob-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-Text-Glob-tests-0.11-26.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Text-Glob-tests = "perl(strict) ( ) /usr/bin/perl ( ) /usr/bin/sh ( ) perl-Test-Harness ( ) perl(Test::More) ( ) perl-Text-Glob ( =  0.11-26.el10)"
RPROVIDES:perl-Text-Glob-tests = "perl-Text-Glob-tests ( =  0.11-26.el10)"
