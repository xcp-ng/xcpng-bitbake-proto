
PN = "perl-HTTP-Message"
PE = "0"
PV = "6.45"
PR = "5.el10"
PACKAGES = "perl-HTTP-Message perl-HTTP-Message-tests"


URI_perl-HTTP-Message = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-HTTP-Message-6.45-5.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-HTTP-Message = "perl(strict) ( ) perl-libs ( ) perl(warnings) ( ) perl(Carp) ( ) perl(File::Spec) ( ) perl(parent) ( ) perl(MIME::QuotedPrint) ( ) perl(HTTP::Status) ( ) perl(HTTP::Headers) ( ) perl(HTTP::Headers::Util) ( ) perl(HTTP::Request) ( ) perl(IO::Compress::Gzip) ( ) perl(IO::Uncompress::Inflate) ( ) perl(IO::Uncompress::RawInflate) ( ) perl(HTTP::Message) ( ) perl(IO::Compress::Deflate) ( ) perl(IO::HTML) ( ) perl(Exporter) ( >=  5.57) perl(HTTP::Date) ( >=  6) perl(URI) ( >=  1.10) perl(LWP::MediaTypes) ( >=  6) perl(MIME::Base64) ( >=  2.1) perl(Clone) ( >=  0.46) perl(Compress::Raw::Zlib) ( >=  2.062) perl(Encode) ( >=  3.01) perl(Encode::Locale) ( >=  1) perl(IO::Compress::Bzip2) ( >=  2.021)"
RPROVIDES:perl-HTTP-Message = "perl(HTTP::Config) ( =  6.45) perl(HTTP::Headers) ( =  6.45) perl(HTTP::Headers::Auth) ( =  6.45) perl(HTTP::Headers::ETag) ( =  6.45) perl(HTTP::Headers::Util) ( =  6.45) perl(HTTP::Message) ( =  6.45) perl(HTTP::Request) ( =  6.45) perl(HTTP::Request::Common) ( =  6.45) perl(HTTP::Response) ( =  6.45) perl(HTTP::Status) ( =  6.45) perl-HTTP-Message ( =  6.45-5.el10)"

URI_perl-HTTP-Message-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-HTTP-Message-tests-6.45-5.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-HTTP-Message-tests = "perl(strict) ( ) /usr/bin/perl ( ) /usr/bin/sh ( ) perl-Test-Harness ( ) perl(warnings) ( ) perl(File::Spec) ( ) perl(lib) ( ) perl(Config) ( ) perl(File::Temp) ( ) perl(overload) ( ) perl(ExtUtils::MakeMaker) ( ) perl(Encode) ( ) perl(Test::Needs) ( ) perl(Try::Tiny) ( ) perl(HTTP::Request) ( ) perl(PerlIO::encoding) ( ) perl(Compress::Raw::Zlib) ( ) perl(HTTP::Response) ( ) perl(URI::URL) ( ) perl(HTTP::Config) ( ) perl(HTTP::Headers) ( ) perl(HTTP::Headers::Auth) ( ) perl(HTTP::Headers::ETag) ( ) perl(HTTP::Headers::Util) ( ) perl(HTTP::Message) ( ) perl(HTTP::Request::Common) ( ) perl(HTTP::Status) ( ) perl(Test::More) ( >=  0.88) perl-HTTP-Message ( =  6.45-5.el10)"
RPROVIDES:perl-HTTP-Message-tests = "perl-HTTP-Message-tests ( =  6.45-5.el10)"
