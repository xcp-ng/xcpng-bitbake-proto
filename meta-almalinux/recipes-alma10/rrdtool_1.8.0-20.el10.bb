
PN = "rrdtool"
PE = "0"
PV = "1.8.0"
PR = "20.el10"
PACKAGES = "rrdtool rrdtool-perl python3-rrdtool rrdtool-devel rrdtool-doc rrdtool-lua rrdtool-ruby rrdtool-tcl"


URI_rrdtool = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/rrdtool-1.8.0-20.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:rrdtool = "/bin/sh ( ) systemd ( ) rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libm.so.6()(64bit) ( ) libm.so.6(GLIBC_2.2.5)(64bit) ( ) libglib-2.0.so.0()(64bit) ( ) libm.so.6(GLIBC_2.29)(64bit) ( ) libgobject-2.0.so.0()(64bit) ( ) libm.so.6(GLIBC_2.38)(64bit) ( ) libxml2.so.2()(64bit) ( ) libcairo.so.2()(64bit) ( ) libxml2.so.2(LIBXML2_2.4.30)(64bit) ( ) libpango-1.0.so.0()(64bit) ( ) libxml2.so.2(LIBXML2_2.6.0)(64bit) ( ) libpangocairo-1.0.so.0()(64bit) ( ) libpng16.so.16()(64bit) ( ) libharfbuzz.so.0()(64bit) ( ) libpng16.so.16(PNG16_0)(64bit) ( ) libxml2.so.2(LIBXML2_2.6.17)(64bit) ( ) dejavu-sans-mono-fonts ( )"
RPROVIDES:rrdtool = "librrd.so.8()(64bit) ( ) rrdtool ( =  1.8.0-20.el10) rrdtool(x86-64) ( =  1.8.0-20.el10)"

URI_rrdtool-perl = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/rrdtool-perl-1.8.0-20.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:rrdtool-perl = "rtld(GNU_HASH) ( ) perl(strict) ( ) perl-libs ( ) perl(Carp) ( ) libc.so.6(GLIBC_2.4)(64bit) ( ) libperl.so.5.40()(64bit) ( ) perl(vars) ( ) perl(:MODULE_COMPAT_5.40.0) ( ) perl(Fcntl) ( ) perl(IO::Handle) ( ) perl(DynaLoader) ( ) perl(IPC::Open2) ( ) librrd.so.8()(64bit) ( ) rrdtool ( =  1.8.0-20.el10)"
RPROVIDES:rrdtool-perl = "perl(RRDp) ( =  1.8000) perl(RRDs) ( =  1.8000) perl-rrdtool ( =  1.8.0-20.el10) rrdtool-perl ( =  1.8.0-20.el10) rrdtool-perl(x86-64) ( =  1.8.0-20.el10)"

URI_python3-rrdtool = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/python3-rrdtool-1.8.0-20.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:python3-rrdtool = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) /usr/bin/python3 ( ) librrd.so.8()(64bit) ( ) python(abi) ( =  3.12) rrdtool ( =  1.8.0-20.el10)"
RPROVIDES:python3-rrdtool = "python-rrdtool ( =  1.8.0-20.el10) python3-rrdtool ( =  1.8.0-20.el10) python3-rrdtool(x86-64) ( =  1.8.0-20.el10) python3.12-rrdtool ( =  1.8.0-20.el10) python3.12dist(rrdtool) ( =  0.1.10) python3dist(rrdtool) ( =  0.1.10)"

URI_rrdtool-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/rrdtool-devel-1.8.0-20.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:rrdtool-devel = "/usr/bin/pkg-config ( ) pkgconfig ( ) librrd.so.8()(64bit) ( ) rrdtool ( =  1.8.0-20.el10)"
RPROVIDES:rrdtool-devel = "pkgconfig(librrd) ( =  1.8.0) rrdtool-devel ( =  1.8.0-20.el10) rrdtool-devel(x86-64) ( =  1.8.0-20.el10)"

URI_rrdtool-doc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/rrdtool-doc-1.8.0-20.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:rrdtool-doc = ""
RPROVIDES:rrdtool-doc = "rrdtool-doc ( =  1.8.0-20.el10) rrdtool-doc(x86-64) ( =  1.8.0-20.el10)"

URI_rrdtool-lua = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/rrdtool-lua-1.8.0-20.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:rrdtool-lua = "rtld(GNU_HASH) ( ) libm.so.6()(64bit) ( ) libc.so.6(GLIBC_2.4)(64bit) ( ) libglib-2.0.so.0()(64bit) ( ) libgobject-2.0.so.0()(64bit) ( ) libcairo.so.2()(64bit) ( ) libpango-1.0.so.0()(64bit) ( ) libpng16.so.16()(64bit) ( ) libpangocairo-1.0.so.0()(64bit) ( ) librrd.so.8()(64bit) ( ) libxml2.so.2()(64bit) ( ) libharfbuzz.so.0()(64bit) ( ) liblua-5.4.so()(64bit) ( ) rrdtool ( =  1.8.0-20.el10) lua(abi) ( =  5.4)"
RPROVIDES:rrdtool-lua = "rrdtool-lua ( =  1.8.0-20.el10) rrdtool-lua(x86-64) ( =  1.8.0-20.el10)"

URI_rrdtool-ruby = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/rrdtool-ruby-1.8.0-20.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:rrdtool-ruby = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.4)(64bit) ( ) libruby.so.3.3()(64bit) ( ) rrdtool ( =  1.8.0-20.el10)"
RPROVIDES:rrdtool-ruby = "rrdtool-ruby ( =  1.8.0-20.el10) rrdtool-ruby(x86-64) ( =  1.8.0-20.el10)"

URI_rrdtool-tcl = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/rrdtool-tcl-1.8.0-20.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:rrdtool-tcl = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) librrd.so.8()(64bit) ( ) /usr/bin/tclsh8.6 ( ) rrdtool ( =  1.8.0-20.el10) tcl ( >=  8.0)"
RPROVIDES:rrdtool-tcl = "rrdtool-tcl ( =  1.8.0-20.el10) rrdtool-tcl(x86-64) ( =  1.8.0-20.el10) tcl-rrdtool ( =  1.8.0-20.el10)"
