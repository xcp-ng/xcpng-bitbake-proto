
PN = "perl-XML-SAX"
PE = "0"
PV = "1.02"
PR = "18.el10"
PACKAGES = "perl-XML-SAX perl-XML-SAX-tests"


URI_perl-XML-SAX = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-XML-SAX-1.02-18.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-XML-SAX = "/bin/sh ( ) perl(strict) ( ) perl-libs ( ) perl(Carp) ( ) perl(Exporter) ( ) perl(vars) ( ) perl(constant) ( ) perl(File::Spec) ( ) perl(File::Basename) ( ) perl(overload) ( ) perl(Encode) ( ) perl(File::Temp) ( ) perl(Symbol) ( ) perl(IO::File) ( ) perl(LWP::UserAgent) ( ) perl(XML::NamespaceSupport) ( ) perl(XML::SAX::Exception) ( ) perl(XML::SAX) ( ) perl(XML::SAX::Base) ( ) perl(XML::SAX::ParserFactory) ( )"
RPROVIDES:perl-XML-SAX = "perl(XML::SAX::DocumentLocator) ( ) perl(XML::SAX::PurePerl::DebugHandler) ( ) perl(XML::SAX::PurePerl::Exception) ( ) perl(XML::SAX::PurePerl::Productions) ( ) perl(XML::SAX::PurePerl::Reader) ( ) perl(XML::SAX::PurePerl::Reader::Stream) ( ) perl(XML::SAX::PurePerl::Reader::String) ( ) perl(XML::SAX::PurePerl::Reader::URI) ( ) perl(XML::SAX) ( =  1.02) perl(XML::SAX::ParserFactory) ( =  1.02) perl(XML::SAX::PurePerl) ( =  1.02) perl-XML-SAX ( =  1.02-18.el10)"

URI_perl-XML-SAX-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-XML-SAX-tests-1.02-18.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-XML-SAX-tests = "perl(strict) ( ) /usr/bin/perl ( ) perl-Test-Harness ( ) perl(warnings) ( ) /usr/bin/bash ( ) perl(vars) ( ) perl(base) ( ) perl(File::Path) ( ) perl(Test) ( ) perl(IO::File) ( ) perl(XML::SAX::Base) ( ) perl(Fatal) ( ) perl(XML::SAX) ( ) perl(XML::SAX::ParserFactory) ( ) perl-XML-SAX ( =  1.02-18.el10)"
RPROVIDES:perl-XML-SAX-tests = "perl-XML-SAX-tests ( =  1.02-18.el10)"
