
PN = "perl-CGI"
PE = "0"
PV = "4.61"
PR = "5.el10"
PACKAGES = "perl-CGI perl-CGI-tests"


URI_perl-CGI = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-CGI-4.61-5.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-CGI = "perl(strict) ( ) perl-libs ( ) perl(warnings) ( ) perl(Carp) ( ) perl(Exporter) ( ) perl(overload) ( ) perl(parent) ( ) perl(Text::ParseWords) ( ) perl(CGI) ( ) perl(CGI::Util) ( ) perl(:VERSION) ( >=  5.8.1) perl(:VERSION) ( >=  5.0.0) perl(File::Spec) ( >=  0.82) perl(File::Temp) ( >=  0.17) perl(HTML::Entities) ( >=  3.69)"
RPROVIDES:perl-CGI = "perl(CGI::HTML::Functions) ( ) perl(CGI::MultipartBuffer) ( ) perl(CGI) ( =  4.61) perl(CGI::Carp) ( =  4.61) perl(CGI::Cookie) ( =  4.59) perl(CGI::File::Temp) ( =  4.61) perl(CGI::Pretty) ( =  4.61) perl(CGI::Push) ( =  4.61) perl(CGI::Util) ( =  4.59) perl-CGI ( =  4.61-5.el10)"

URI_perl-CGI-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-CGI-tests-4.61-5.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-CGI-tests = "perl(strict) ( ) /usr/bin/perl ( ) /usr/bin/sh ( ) perl-Test-Harness ( ) perl(warnings) ( ) perl(Test::More) ( ) perl(lib) ( ) perl(Config) ( ) perl(Cwd) ( ) perl(utf8) ( ) perl(IO::Handle) ( ) perl(overload) ( ) perl(Encode) ( ) perl(IO::File) ( ) perl(POSIX) ( ) perl(FindBin) ( ) perl(FileHandle) ( ) perl(CGI) ( ) perl(CGI::Carp) ( ) perl(CGI::Cookie) ( ) perl(CGI::Pretty) ( ) perl(CGI::Util) ( ) perl(Test::Warn) ( ) perl-CGI ( =  4.61-5.el10)"
RPROVIDES:perl-CGI-tests = "perl-CGI-tests ( =  4.61-5.el10)"
