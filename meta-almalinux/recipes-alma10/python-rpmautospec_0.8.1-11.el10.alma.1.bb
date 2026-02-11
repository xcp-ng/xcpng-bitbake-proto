
PN = "python-rpmautospec"
PE = "0"
PV = "0.8.1"
PR = "11.el10.alma.1"
PACKAGES = "rpmautospec"


URI_rpmautospec = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/rpmautospec-0.8.1-11.el10.alma.1.noarch.rpm;unpack=0"
RDEPENDS:rpmautospec = "/usr/bin/python3 ( ) rpm-build-libs ( ) rpm-libs ( ) libgit2.so.1.7()(64bit) ( or  libgit2.so.1.7)"
RPROVIDES:rpmautospec = "bundled(python3dist(rpmautospec)) ( =  0.8.1) bundled(python3dist(rpmautospec-core)) ( =  0.1.5) rpmautospec ( =  0.8.1-11.el10.alma.1)"
