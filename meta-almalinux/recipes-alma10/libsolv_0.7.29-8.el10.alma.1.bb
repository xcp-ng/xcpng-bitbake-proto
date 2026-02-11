
PN = "libsolv"
PE = "0"
PV = "0.7.29"
PR = "8.el10.alma.1"
PACKAGES = "libsolv python3-solv libsolv-devel libsolv-tools libsolv-tools-base libsolv-demo perl-solv ruby-solv"


URI_libsolv = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/libsolv-0.7.29-8.el10.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:libsolv = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libcrypto.so.3()(64bit) ( ) libcrypto.so.3(OPENSSL_3.0.0)(64bit) ( ) libz.so.1()(64bit) ( ) liblzma.so.5()(64bit) ( ) liblzma.so.5(XZ_5.0)(64bit) ( ) libxml2.so.2()(64bit) ( ) libxml2.so.2(LIBXML2_2.4.30)(64bit) ( ) libzstd.so.1()(64bit) ( ) libbz2.so.1()(64bit) ( ) libxml2.so.2(LIBXML2_2.6.0)(64bit) ( ) librpmio.so.10()(64bit) ( ) librpm.so.10()(64bit) ( ) libz.so.1(ZLIB_1.2.3.3)(64bit) ( )"
RPROVIDES:libsolv = "libsolv.so.1()(64bit) ( ) libsolv.so.1(SOLV_1.0)(64bit) ( ) libsolvext.so.1()(64bit) ( ) libsolvext.so.1(SOLV_1.0)(64bit) ( ) libsolv.so.1(SOLV_1.1)(64bit) ( ) libsolv.so.1(SOLV_1.2)(64bit) ( ) libsolv.so.1(SOLV_1.3)(64bit) ( ) libsolv ( =  0.7.29-8.el10.alma.1) libsolv(x86-64) ( =  0.7.29-8.el10.alma.1)"

URI_python3-solv = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/python3-solv-0.7.29-8.el10.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:python3-solv = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.33)(64bit) ( ) libsolv.so.1()(64bit) ( ) libsolv.so.1(SOLV_1.0)(64bit) ( ) libsolvext.so.1()(64bit) ( ) libsolvext.so.1(SOLV_1.0)(64bit) ( ) libsolv.so.1(SOLV_1.1)(64bit) ( ) libsolv.so.1(SOLV_1.2)(64bit) ( ) libsolv.so.1(SOLV_1.3)(64bit) ( ) python(abi) ( =  3.12) libsolv(x86-64) ( =  0.7.29-8.el10.alma.1)"
RPROVIDES:python3-solv = "python-solv ( =  0.7.29-8.el10.alma.1) python3-solv ( =  0.7.29-8.el10.alma.1) python3-solv(x86-64) ( =  0.7.29-8.el10.alma.1) python3.12-solv ( =  0.7.29-8.el10.alma.1)"

URI_libsolv-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libsolv-devel-0.7.29-8.el10.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:libsolv-devel = "/usr/bin/pkg-config ( ) libsolv.so.1()(64bit) ( ) libsolvext.so.1()(64bit) ( ) pkgconfig(libsolv) ( ) rpm-devel(x86-64) ( ) libsolv(x86-64) ( =  0.7.29-8.el10.alma.1)"
RPROVIDES:libsolv-devel = "libsolv-devel ( =  0.7.29-8.el10.alma.1) libsolv-devel(x86-64) ( =  0.7.29-8.el10.alma.1) pkgconfig(libsolv) ( =  0.7.29) pkgconfig(libsolvext) ( =  0.7.29)"

URI_libsolv-tools = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libsolv-tools-0.7.29-8.el10.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:libsolv-tools = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) /usr/bin/find ( ) libsolv.so.1()(64bit) ( ) libsolvext.so.1()(64bit) ( ) libsolv.so.1(SOLV_1.0)(64bit) ( ) libsolvext.so.1(SOLV_1.0)(64bit) ( ) libsolv(x86-64) ( =  0.7.29-8.el10.alma.1) libsolv-tools-base ( =  0.7.29-8.el10.alma.1)"
RPROVIDES:libsolv-tools = "libsolv-tools ( =  0.7.29-8.el10.alma.1) libsolv-tools(x86-64) ( =  0.7.29-8.el10.alma.1)"

URI_libsolv-tools-base = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libsolv-tools-base-0.7.29-8.el10.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:libsolv-tools-base = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) libsolv.so.1()(64bit) ( ) libsolvext.so.1()(64bit) ( ) libsolv.so.1(SOLV_1.0)(64bit) ( ) libsolvext.so.1(SOLV_1.0)(64bit) ( ) librpmio.so.10()(64bit) ( ) libsolv(x86-64) ( =  0.7.29-8.el10.alma.1)"
RPROVIDES:libsolv-tools-base = "libsolv-tools:/usr/bin/repo2solv ( ) libsolv-tools-base ( =  0.7.29-8.el10.alma.1) libsolv-tools-base(x86-64) ( =  0.7.29-8.el10.alma.1)"

URI_libsolv-demo = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libsolv-demo-0.7.29-8.el10.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:libsolv-demo = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) libsolv.so.1()(64bit) ( ) libsolv.so.1(SOLV_1.0)(64bit) ( ) libsolvext.so.1()(64bit) ( ) libsolvext.so.1(SOLV_1.0)(64bit) ( ) /usr/bin/curl ( ) /usr/bin/gpg2 ( ) libsolv(x86-64) ( =  0.7.29-8.el10.alma.1)"
RPROVIDES:libsolv-demo = "libsolv-demo ( =  0.7.29-8.el10.alma.1) libsolv-demo(x86-64) ( =  0.7.29-8.el10.alma.1)"

URI_perl-solv = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-solv-0.7.29-8.el10.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:perl-solv = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) perl(Exporter) ( ) perl(vars) ( ) perl-libs ( ) perl(base) ( ) perl(overload) ( ) perl(DynaLoader) ( ) libsolv.so.1()(64bit) ( ) libsolv.so.1(SOLV_1.0)(64bit) ( ) libsolvext.so.1()(64bit) ( ) libsolvext.so.1(SOLV_1.0)(64bit) ( ) libsolv.so.1(SOLV_1.1)(64bit) ( ) libsolv.so.1(SOLV_1.2)(64bit) ( ) libsolv.so.1(SOLV_1.3)(64bit) ( ) perl(:MODULE_COMPAT_5.40.1) ( ) libsolv(x86-64) ( =  0.7.29-8.el10.alma.1)"
RPROVIDES:perl-solv = "perl(solv) ( ) perl(solv::Alternative) ( ) perl(solv::Chksum) ( ) perl(solv::Dataiterator) ( ) perl(solv::Datamatch) ( ) perl(solv::Datapos) ( ) perl(solv::Decision) ( ) perl(solv::Decisionset) ( ) perl(solv::Dep) ( ) perl(solv::Job) ( ) perl(solv::Pool) ( ) perl(solv::Pool_repo_iterator) ( ) perl(solv::Pool_solvable_iterator) ( ) perl(solv::Problem) ( ) perl(solv::Repo) ( ) perl(solv::Repo_solvable_iterator) ( ) perl(solv::Ruleinfo) ( ) perl(solv::Selection) ( ) perl(solv::Solution) ( ) perl(solv::Solutionelement) ( ) perl(solv::SolvFp) ( ) perl(solv::Solver) ( ) perl(solv::Transaction) ( ) perl(solv::TransactionClass) ( ) perl(solv::XRepodata) ( ) perl(solv::XRule) ( ) perl(solv::XSolvable) ( ) perl(solvc) ( ) perl-solv ( =  0.7.29-8.el10.alma.1) perl-solv(x86-64) ( =  0.7.29-8.el10.alma.1)"

URI_ruby-solv = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/ruby-solv-0.7.29-8.el10.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:ruby-solv = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.33)(64bit) ( ) libsolv.so.1()(64bit) ( ) libsolv.so.1(SOLV_1.0)(64bit) ( ) libsolvext.so.1()(64bit) ( ) libsolvext.so.1(SOLV_1.0)(64bit) ( ) libsolv.so.1(SOLV_1.1)(64bit) ( ) libsolv.so.1(SOLV_1.2)(64bit) ( ) libsolv.so.1(SOLV_1.3)(64bit) ( ) libsolv(x86-64) ( =  0.7.29-8.el10.alma.1)"
RPROVIDES:ruby-solv = "ruby-solv ( =  0.7.29-8.el10.alma.1) ruby-solv(x86-64) ( =  0.7.29-8.el10.alma.1)"
