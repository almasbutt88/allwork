use zoo;
const id = ObjectId('61ae25552a039406b243d569');
db.animals.findOne({_id:id});

db.animals.updateOne(
{ _id:ObjectId('61ae25552a039406b243d569')}, // first object field is one you are changing
{$set:{name: "Fyfe"}} // second object field is the one you are changing to
);

//$ is to find one item

//or you can do the following to chain commands together

// db.animals.findOne({_id:id});

db.animals.deleteOne(
    {
        _id:ObjectId('61ae25552a039406b243d569')
    }
);

