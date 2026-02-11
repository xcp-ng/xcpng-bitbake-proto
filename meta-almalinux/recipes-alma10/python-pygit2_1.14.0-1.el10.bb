
PN = "python-pygit2"
PE = "0"
PV = "1.14.0"
PR = "1.el10"
PACKAGES = "python-pygit2-doc python3-pygit2"


URI_python-pygit2-doc = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/python-pygit2-doc-1.14.0-1.el10.noarch.rpm;unpack=0"
RDEPENDS:python-pygit2-doc = ""

URI_python3-pygit2 = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/python3-pygit2-1.14.0-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:python3-pygit2 = " \
 python3 \
 python3-cffi \
 libgit2 \
 python3-setuptools \
 glibc \
"
