
PN = "perl-Data-Dump"
PE = "0"
PV = "1.25"
PR = "13.el10"
PACKAGES = "perl-Data-Dump perl-Data-Dump-tests"


URI_perl-Data-Dump = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-Data-Dump-1.25-13.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Data-Dump = "perl(strict) ( ) perl-libs ( ) perl(Carp) ( ) perl(Exporter) ( ) perl(vars) ( ) perl(overload) ( ) perl(base) ( ) perl(Term::ANSIColor) ( ) perl(subs) ( ) perl(Data::Dump) ( )"
RPROVIDES:perl-Data-Dump = "perl(Data::Dump::FilterContext) ( ) perl(Data::Dump::Filtered) ( ) perl(Data::Dump::Trace::Call) ( ) perl(Data::Dump::Trace::Wrapper) ( ) perl(Data::Dump) ( =  1.25) perl(Data::Dump::Trace) ( =  0.02) perl-Data-Dump ( =  1.25-13.el10)"

URI_perl-Data-Dump-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-Data-Dump-tests-1.25-13.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Data-Dump-tests = "perl(strict) ( ) /usr/bin/perl ( ) /usr/bin/sh ( ) perl-Test-Harness ( ) perl(warnings) ( ) perl(Test::More) ( ) perl(vars) ( ) perl(Test) ( ) perl(Symbol) ( ) perl(IO::Socket::INET) ( ) perl(Data::Dump) ( ) perl-Data-Dump ( =  1.25-13.el10)"
RPROVIDES:perl-Data-Dump-tests = "perl-Data-Dump-tests ( =  1.25-13.el10)"
